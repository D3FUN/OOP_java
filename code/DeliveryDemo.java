interface IDelivery {
    void deliver(String parcel);
}

abstract class DeliveryService {
    protected abstract IDelivery createDelivery();

    public void send(String parcel) {
        IDelivery delivery = createDelivery();
        delivery.deliver(parcel);
    }
}

final class CdekDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return parcel -> System.out.println("Доставка через СДЭК: " + parcel);
    }
}

final class RussianPostDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return parcel -> System.out.println("Доставка через Почту России: " + parcel);
    }
}

final class FlyingCarDelivery extends DeliveryService {
    @Override
    protected IDelivery createDelivery() {
        return parcel -> System.out.println("Доставка на летающей машине: " + parcel);
    }
}

public class DeliveryDemo {
    public static void main(String[] args) {
        String method = args.length > 0 ? args[0] : "cdek";
        DeliveryService service;

        switch (method) {
            case "cdek":
                service = new CdekDelivery();
                break;
            case "post":
                service = new RussianPostDelivery();
                break;
            case "flying":
                service = new FlyingCarDelivery();
                break;
            default:
                System.out.println("Выберите способ доставки: cdek, post или flying");
                return;
        }

        service.send("Посылка с книгами");
    }
}
