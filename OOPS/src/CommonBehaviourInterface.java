interface Printable{
    void print();
}
class Document implements Printable{
    public void print(){
        System.out.println("Document printed ");
    }
    class Image implements Printable{
        public void print(){
            System.out.println("print Image ");
        }
    }
}
public class CommonBehaviourInterface {


}
