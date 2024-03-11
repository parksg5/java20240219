package ch08.Exercise.p7;

public class MySqlDao implements DataAccessObject {

    @Override
    public void select() {
        System.out.println("mysql db에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("mysqul db에 삽입");
    }

    @Override
    public void update() {
        System.out.println("mysqul db를 수정");
    }

    @Override
    public void delete() {
        System.out.println("mysqul db에서 삭제");
    }
}
