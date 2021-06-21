package jpabook.jpashop.domain.exception;

public class NotEnoughStockException extends RuntimeException {
    public NotEnoughStockException(String msg) {
        super(msg);
    }
}
