/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import net.minecraft.u.cc;
import org.apache.logging.log4j.d;

public class cb {
    public static cc a() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? cc.c : (string.contains("mac") ? cc.d : (string.contains("solaris") ? cc.b : (string.contains("sunos") ? cc.b : (string.contains("linux") ? cc.a : (string.contains("unix") ? cc.a : cc.e)))));
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

