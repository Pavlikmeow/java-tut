public class Shkola extends Human {
    @Override
    public String getAge() {
        System.out.println("Мне 10 лет");
        return null;
    }
    @Override
    public void stand() {
        System.out.println("Я стою");
    }
    @Override
    public void sit() {
        System.out.println("Я сижу");
    }
}