//package com.studymavernspringboot.test.PhoneServiceTest;
//
//import com.studymavernspringboot.test.PhoneService.*;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class PhoneBookRepositoryTest {
//    @Test
//    public void jsonRepositoryTest() throws Exception {
//        PhoneBookJsonRepository repository = new PhoneBookJsonRepository("kjs.json");
//
//        String json = "{\"phoneNumber\":\"010-8476-7844\",\"name\":\"강준서\",\"id\":1,\"email\":\"pobyjun@naver.com\",\"group\":\"Families\"}";
//        JSONParser jsonParser = new JSONParser();
//        IPhoneBook phoneBook = null;
//        Object obj = jsonParser.parse(json);
//        phoneBook = repository.getObjectFromJson((JSONObject)obj);
//        assertThat(phoneBook.getId()).isEqualTo(1L);
//        assertThat(phoneBook.getName()).isEqualTo("강준서");
//        assertThat(phoneBook.getGroup()).isEqualTo(EPhoneGroup.Families);
//        assertThat(phoneBook.getPhoneNumber()).isEqualTo("010-8476-7844");
//        assertThat(phoneBook.getEmail()).isEqualTo("pobyjun@naver.com");
//
//        IPhoneBook phoneBook2 = new PhoneBook();
//        phoneBook2.setId(12L);
//        phoneBook2.setName("친구친구");
//        phoneBook2.setGroup(EPhoneGroup.Friends);
//        phoneBook2.setPhoneNumber("1111-2222");
//        phoneBook2.setEmail("friend@naver.com");
//        JSONObject jobject = repository.getJsonFromObject(phoneBook2);
//        assertThat((Long)jobject.get("id")).isEqualTo(12L);
//        assertThat((String)jobject.get("name")).isEqualTo("친구친구");
//        assertThat((EPhoneGroup.valueOf((String)jobject.get("group")))).isEqualTo(EPhoneGroup.Friends);
//        assertThat((String)jobject.get("phoneNumber")).isEqualTo("1111-2222");
//        assertThat((String)jobject.get("email")).isEqualTo("friend@naver.com");
//        assertThat(jobject.toJSONString()).isEqualTo("{\"phoneNumber\":\"1111-2222\",\"name\":\"친구친구\",\"id\":12,\"email\":\"friend@naver.com\",\"group\":\"Friends\"}");
//    }
//
//    @Test
//    public void textRepositoryTest() throws Exception {
//        PhoneBookTextRepository repository = new PhoneBookTextRepository("kjs.txt");
//
//        IPhoneBook phoneBook = repository.getObjectFromText("1,강준서,Friends,010-8476-7844,pobyjun@naver.com");
//        assertThat(phoneBook.getId()).isEqualTo(1L);
//        assertThat(phoneBook.getName()).isEqualTo("강준서");
//        assertThat(phoneBook.getGroup()).isEqualTo(EPhoneGroup.Friends);
//        assertThat(phoneBook.getPhoneNumber()).isEqualTo("010-8476-7844");
//        assertThat(phoneBook.getEmail()).isEqualTo("pobyjun@naver.com");
//
//        String str = repository.getTextFromObject(phoneBook);
//        assertThat(str).isEqualTo("1,강준서,Friends,010-8476-7844,pobyjun@naver.com\n");
//    }
//}
