import java.util.UUID;

public class Conta {
    private UUID id;
    private double saldo;


    public Conta() {
        this.id = UUID.randomUUID();
        this.saldo = 0.0;
    }
}
