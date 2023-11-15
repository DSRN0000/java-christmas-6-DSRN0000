package christmas.view;

public class OutputBonusMenu {
    private static final String OUTPUT = "<증정 메뉴>";

    public void outputBonusMenu(String value){
        print();
        isOverPrice(value);
    }

    private void print(){
        System.out.println(OUTPUT);
    }
    private void isOverPrice(String value){
        System.out.println(value);
    }
}
