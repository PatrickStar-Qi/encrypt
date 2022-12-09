import com.alibaba.fastjson.JSONObject;
import com.jjk.dome.domain.*;
import com.jjk.dome.utils.AesUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jq
 * @date 2022/11/30 17:04
 */
@Slf4j
public class dome {

    public static void main(String[] args) {
        String KEY = "c7e34da840594832";
        String IV = "81a65404ee206499";
        String name = "小吉测试";
        List<Detail> detailList = new ArrayList<Detail>();
        detailList.add(new Detail("SHU_ZHANG_YA","115","血压"));
        detailList.add(new Detail("TI_WEN","36.5","体温"));
        detailList.add(new Detail("TI_GE_JIAN_CHA","体格检查测试11","体格检查"));
        detailList.add(new Detail("ZHU_SU","主诉测试111","主诉"));
        detailList.add(new Detail("XIAN_GINB_SHI","现病史测试111","现病史"));
        detailList.add(new Detail("JI_WANG_SHI","既往史测试111","既往史"));
        detailList.add(new Detail("FU_ZHU_JIAN_CHA_JIE_GUO","辅助检查结果1","辅助检查结果"));
        detailList.add(new Detail("ZHONG_YI_WANG_WEN_QIE_ZHEN","中医测试11","中医望闻切诊"));

        List<Diagnosis> diagnosesList = new ArrayList<Diagnosis>();
        diagnosesList.add(new Diagnosis("2","中医诊断","BNW080","中暑病",new Date(122,11,1)));
        diagnosesList.add(new Diagnosis("1","西医主要诊断","J06.900","急性上呼吸道感染",new Date(122,11,1)));

        List<Prescription> prescriptionList = new ArrayList<Prescription>();

        prescriptionList.add(new Prescription(false,"drug_western","XY21000683","硝呋太尔制霉素阴道软胶囊",new BigDecimal("30.0000"),new BigDecimal("30.0000"),1,"501018",1,1,1));

        MedicalRecordHis medicalRecordHis = new MedicalRecordHis();
        long currentTime = System.currentTimeMillis();
        medicalRecordHis.setHospitalCode("JCH0003");
        medicalRecordHis.setOutpatientId("6a065d1e-57f1-4f79-a836-f8fcbbd4da09");
        medicalRecordHis.setIdCard("370983198412136917");
        medicalRecordHis.setPatientName("姜海亮");
        medicalRecordHis.setTreatmentDate(new Date(122,11,1));
        medicalRecordHis.setVisiteDoctorCode("gxq");
        medicalRecordHis.setVisiteDoctorName("宫晓庆");
        medicalRecordHis.setHisId("f0f998b4c6ac931cfff8d5479f9a0be5");
        medicalRecordHis.setDetailList(detailList);
        medicalRecordHis.setDiagnosisList(diagnosesList);
        medicalRecordHis.setPrescriptionList(prescriptionList);
        medicalRecordHis.setCurrentTimeMillis(currentTime);

        HisMedicalParam hisMedicalParam = new HisMedicalParam();
        hisMedicalParam.setCurrentUser("saveMedicalRecord");
        hisMedicalParam.setText(JSONObject.toJSONString(medicalRecordHis));


        log.info("传参前：{}",JSONObject.toJSONString(hisMedicalParam));

        HttpHeaders httpHeaders = new HttpHeaders();
        // 设置请求参数流格式
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpEntity = new HttpEntity<String>(JSONObject.toJSONString(hisMedicalParam), httpHeaders);

        RestTemplate restTemplate = new RestTemplate();

        String s = restTemplate.postForObject("http://192.168.5.241/prod-api/his/medical-record/saveMedicalRecord", httpEntity, String.class);
        log.info(s);

//        String key = com.jjk.dome.utils.AesUtils.randomString(16);
//        String iv = com.jjk.dome.utils.AesUtils.randomString(16);
//        System.out.println(key+" | "+iv);

//        System.out.println(KEY+" | "+IV);
        System.out.println("加密前参数："+name);
        String text = AesUtils.encode(KEY, IV, name);
        System.out.println("加密前密文："+text);
        String decode = AesUtils.decode(KEY, IV, text);
        System.out.println("解密后参数："+decode);
    }

}
