public class ServiceStation implements Service {

    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            transport.service();


        }
    }
}
