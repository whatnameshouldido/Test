//package com.studymavernspringboot.test.PhoneService;
//
//import java.util.List;
//
//public interface IPhoneBookService<I> {
//    int size();
//    Long getMaxId();
//    IPhoneBook findById(Long id);
//    List<IPhoneBook> getAllList();
//    boolean insert(String name, EPhoneGroup group, String phoneNumber, String email) throws Exception;
//    boolean insert(IPhoneBook phoneBook) throws Exception;
//    boolean remove(Long id) throws Exception;
//    boolean update(Long id, IPhoneBook phoneBook) throws Exception;
//    List<I> getListFromName(String findName);
//    List<I> getListFromGroup(EPhoneGroup phoneGroup);
//    List<I> getListFromPhoneNumber(String findPhone);
//    List<I> getListFromEmail(String findEmail);
//    boolean loadData() throws Exception;
//    boolean saveData() throws Exception;
//}