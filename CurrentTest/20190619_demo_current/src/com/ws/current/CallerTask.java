package com.ws.current;

        import java.util.concurrent.Callable;

public class CallerTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "hello";
    }
}
