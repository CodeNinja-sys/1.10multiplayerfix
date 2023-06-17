/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

class w
implements Runnable {
    private final Thread a;
    private final long b;

    public static Thread a(long l2) {
        return w.a(Thread.currentThread(), l2);
    }

    public static Thread a(Thread thread, long l2) {
        Thread thread2 = null;
        if (l2 > 0L) {
            w w2 = new w(thread, l2);
            thread2 = new Thread((Runnable)w2, w.class.getSimpleName());
            thread2.setDaemon(true);
            thread2.start();
        }
        return thread2;
    }

    public static void a(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    private w(Thread thread, long l2) {
        this.a = thread;
        this.b = l2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.b);
            this.a.interrupt();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }
}

