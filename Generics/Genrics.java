public class Genrics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("1212");
        Dog<Integer> d2 = new Dog<>(12);
        
        System.out.println(d2.getId());

        // ArrayList<Integer> a = new ArrayList<>();
    }
}

class Dog<E> {
    E id;

    public Dog(E id){
        this.id = id;
    }

    E getId(){
        return id;
    }

}
