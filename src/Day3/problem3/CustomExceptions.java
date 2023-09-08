package Day3.problem3;

public class CustomExceptions extends Exception{


    public CustomExceptions(String message) {
        super(message);
    }

    public static class InsufficientFunds extends CustomExceptions {
        public InsufficientFunds(String message) {
            super(message);
        }
    }
    public static class LowBalanceException extends CustomExceptions {
        public LowBalanceException(String message) {
            super(message);
        }
    }
    public static class NegativeAmount extends CustomExceptions{
        public NegativeAmount(String message){
            super(message);
        }
    }

}
