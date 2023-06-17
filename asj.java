/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.d;

public class asj {
    public static bsj a() {
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("win")) {
            return bsj.c;
        }
        if (string.contains("mac")) {
            return bsj.d;
        }
        if (string.contains("solaris")) {
            return bsj.b;
        }
        if (string.contains("sunos")) {
            return bsj.b;
        }
        if (string.contains("linux")) {
            return bsj.a;
        }
        if (string.contains("unix")) {
            return bsj.a;
        }
        return bsj.e;
    }

    public static Object a(FutureTask futureTask, d d2) {
        try {
            futureTask.run();
            return futureTask.get();
        }
        catch (ExecutionException executionException) {
            d2.c("Error executing task", (Throwable)executionException);
        }
        catch (InterruptedException interruptedException) {
            d2.c("Error executing task", (Throwable)interruptedException);
        }
        return null;
    }

    public static Object a(List list) {
        return list.get(list.size() - 1);
    }
}

