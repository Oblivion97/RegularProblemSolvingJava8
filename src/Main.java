import Student.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.displayStudentName("H M Mahmudul Hasan");
        int[] intArray = new int[]{ 1,2,2,4,5,5,7,7,9,10 };
        RemoveDuplicatedElementFromArray removeDuplicatedElementFromArray = new RemoveDuplicatedElementFromArray();
        int list = removeDuplicatedElementFromArray.removeDuplicates(intArray);
        System.out.println(list);
    }

//    public void jsonParsingByStringTokenizer(){
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//        mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
//        try {
//            String jsonInString = "{\"DesignationCode\":\"60001\",\"DesignationName\":\"BEP Teacher\",\"ShortFormOfDesignation\":null,\"ProgramType\":null,\"Description\":null,\"JobAuthority\":null,\"JobResponsibility\":null,\"JobSummary\":null,\"RequiredSkillSet\":null},{\"DesignationCode\":\"60002\",\"DesignationName\":\"Cook\",\"ShortFormOfDesignation\":null,\"ProgramType\":null,\"Description\":null,\"JobAuthority\":null,\"JobResponsibility\":null,\"JobSummary\":null,\"RequiredSkillSet\":null}";
//            Test test = mapper.readValue(jsonInString, Test.class);
//            System.out.println(test);
//
//        } catch (JsonGenerationException e) {
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}