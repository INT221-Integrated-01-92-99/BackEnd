package exceptions;

public class ProductException extends RuntimeException{
    ExceptionRepo.ERROR_CODE error_code;

    public ProductException(ExceptionRepo.ERROR_CODE error_code,String message){
        super(message);
        this.error_code = error_code;
    }

    public ExceptionRepo.ERROR_CODE getError_code(){
        return error_code;
    }
}
