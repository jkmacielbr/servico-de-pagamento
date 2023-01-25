import model.Contract;
import model.Installment;
import service.ContractService;
import service.PayService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner tc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");



        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        Integer number = tc.nextInt();
        System.out.print("Data (dd/MM/yyyy: ");
        LocalDate date = LocalDate.parse(tc.next(), fmt);
        System.out.print("Valor: ");
        Double value = tc.nextDouble();
        System.out.print("Entre com número de parcelas: ");
        Integer mounths = tc.nextInt();

        Contract obj = new Contract(number, date, value);

        ContractService service = new ContractService(new PayService());
        service.processContract(obj,mounths);

        for (Installment installment : obj.getInstallment()){
            System.out.println(installment);
        }

    }
}