public class Main {
    public static void main(String[] args) {

        Book b=new Book();
        b.writer="Pushkin";
        System.out.println(b.writer);

        Hamid h = new Hamid();
        h.writer="Poya";
        System.out.println(h.writer);


        Yuliya_sBook bo = new Yuliya_sBook();
        bo.writer="Tolerant";
        System.out.println(bo.writer);

        Rafik_sBook rb = new Rafik_sBook();
        rb.writer = "Tolstoy";
        System.out.println(rb.writer);

    }
}