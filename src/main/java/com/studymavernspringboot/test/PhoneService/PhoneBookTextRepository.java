//package com.studymavernspringboot.test.PhoneService;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//import java.util.List;
//
//public class PhoneBookTextRepository implements IPhoneBookRepository<IPhoneBook>{
//    private String fileName;
//
//    public PhoneBookTextRepository(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public IPhoneBook getObjectFromText(String str) throws Exception {
//        if (str == null) {
//            throw new Exception("Error : Input str is null");
//        }
//        IPhoneBook object = new PhoneBook();
//        String[] items = str.split(",");
//
//        Long id = items.length > 0 && !items[0].isEmpty() ? Long.parseLong(items[0]) : 0L;
//        String name = items.length > 1 ? items[1] : "";
//        EPhoneGroup group = items.length > 2 ? EPhoneGroup.valueOf(items[2]) : EPhoneGroup.DEFAULT; // Assume DEFAULT is a valid group
//        String phoneNumber = items.length > 3 ? items[3] : "";
//        String email = items.length > 4 ? items[4] : "";
//
//        object.setId(id);
//        object.setName(name);
//        object.setGroup(group);
//        object.setPhoneNumber(phoneNumber);
//        object.setEmail(email);
//
//        return object;
//    }
//
//
//    public String getTextFromObject(IPhoneBook object) throws Exception {
//        if (object == null) {
//            throw new Exception("Error : Input object is null");
//        }
//        String str = String.format("%d,%s,%s,%s,%s\n"
//                , object.getId(), object.getName(), object.getGroup()
//                , object.getPhoneNumber(), object.getEmail());
//        return str;
//    }
//
//    @Override
//    public boolean saveData(List<IPhoneBook> listData) throws Exception {
//        if (listData == null || listData.size() <= 0) {
//            return false;
//        }
//        if (fileName == null || fileName.isEmpty()) {
//            return false;
//        }
//        FileOutputStream fileOut = new FileOutputStream(fileName);
//        OutputStreamWriter writer = new OutputStreamWriter(fileOut, StandardCharsets.UTF_8);
//
//        for (IPhoneBook object : listData) {
//            String str = getTextFromObject(object);
//            writer.write(str);
//        }
//        writer.close();
//        return true;
//    }
//
//    @Override
//    public boolean loadData(List<IPhoneBook> listData) throws Exception {
//        if (listData == null) {
//            return false;
//        }
//        File file = new File(fileName);
//        if (!file.exists()) {
//            return false;
//        }
//        BufferedReader inFile = new BufferedReader(new FileReader(file));
//        String sLine = null;
//        listData.clear();
//        while ((sLine = inFile.readLine())!= null) {
//            IPhoneBook object = this.getObjectFromText(sLine);
//            listData.add(object);
//        }
//        return true;
//    }
//}
//
