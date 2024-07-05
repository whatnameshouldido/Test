//package com.studymavernspringboot.test.PhoneService;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class PhoneBookServiceImple implements IPhoneBookService<IPhoneBook> {
//    private List<IPhoneBook> list = new ArrayList<>();
//    private final IPhoneBookRepository<IPhoneBook> phoneBookRepository;
//
//    public PhoneBookServiceImple(String arg1, String fileName) throws Exception {
//        if ("-j".equals(arg1)) {
//            this.phoneBookRepository = new PhoneBookJsonRepository(fileName);
//        } else if ("-t".equals(arg1)) {
//            this.phoneBookRepository = new PhoneBookTextRepository(fileName);
//        } else {
//            throw new Exception("Error : You need program arguments (-j/-t) (filename) !");
//        }
//    }
//
//    @Override
//    public int size() {
//        return this.list.size();
//    }
//
//    @Override
//    public Long getMaxId() {
//        if(this.list.isEmpty()) {
//            return 1L;
//        }
//
//        Long maxId = this.list.stream()
//                .mapToLong(IPhoneBook::getId)
//                .max()
//                .orElse(0L);
//
//        return maxId + 1;
//    }
//
//    @Override
//    public IPhoneBook findById(Long id) {
//        int start = 0;
//        int end = this.list.size() - 1;
//
//        while(start <= end) {
//            int mid = (start + end) / 2;
//            IPhoneBook obj = this.list.get(mid);
//
//            if (id.equals(obj.getId())) {
//                return obj; //찾았을 때
//            } else if (id < obj.getId()){
//                end = mid - 1; //왼쪽 절반 탐색
//            } else {
//                start = mid + 1; //오른쪽 절반 탐색
//            }
//        }
//        return null; //못 찾았을 때
//    }
//
//    @Override
//    public List<IPhoneBook> getAllList() {
//        return this.list;
//    }
//
//    @Override
//    public boolean insert(String name, EPhoneGroup group, String phoneNumber, String email) throws Exception {
//        IPhoneBook phoneBook = PhoneBook.builder()
//                .id(this.getMaxId())
//                .name(name).group(group)
//                .phoneNumber(phoneNumber).email(email).build();
//        this.list.add(phoneBook);
//        this.sortList();  // 리스트 정렬
//        return true;
//    }
//
//    @Override
//    public boolean insert(IPhoneBook phoneBook) throws Exception {
//        this.list.add(phoneBook);
//        this.sortList();  // 리스트 정렬
//        return true;
//    }
//
//    @Override
//    public boolean remove(Long id) {
//        IPhoneBook find = this.findById(id);
//        if (find != null) {
//            this.list.remove(find);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean update(Long id, IPhoneBook phoneBook) {
//        int findIndex = this.findIndexById(id);
//        if (findIndex >= 0) {
//            phoneBook.setId(id);
//            this.list.set(findIndex, phoneBook);
//            this.sortList();  // 리스트 정렬
//            return true;
//        }
//        return false;
//    }
//
//    private int findIndexById(Long id) { //선형탐색 말고 속도 좀 빠르게
//        int start = 0;
//        int end = this.list.size() - 1;
//
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            Long currentId = this.list.get(mid).getId();
//
//            if (id.equals(currentId)) {
//                return mid; //찾았을 때
//            } else if (id < currentId){
//                end = mid - 1; //왼쪽 탐색
//            } else {
//                start = mid + 1; //오른쪽 탐색
//            }
//        }
//        return -1; //못 찾았을 때
//    }
//
//    @Override
//    public List<IPhoneBook> getListFromName(String findName) {
//        return this.list.stream()
//                .filter(phoneBook -> phoneBook.getName().contains(findName))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<IPhoneBook> getListFromGroup(EPhoneGroup phoneGroup) {
//        return this.list.stream()
//                .filter(phoneBook -> phoneGroup.equals(phoneBook.getGroup()))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<IPhoneBook> getListFromPhoneNumber(String findPhone) {
//        return this.list.stream()
//                .filter(phoneBook -> phoneBook.getPhoneNumber().contains(findPhone))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<IPhoneBook> getListFromEmail(String findEmail) {
//        return this.list.stream()
//                .filter(phoneBook -> phoneBook.getEmail().contains(findEmail))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public boolean loadData() throws Exception {
//        return this.phoneBookRepository.loadData(this.list);
//    }
//
//    @Override
//    public boolean saveData() throws Exception {
//        return this.phoneBookRepository.saveData(this.list);
//    }
//
//    private void sortList() {
//        Collections.sort(this.list, Comparator.comparingLong(IPhoneBook::getId));
//    }
//}
//
