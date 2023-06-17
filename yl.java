/*
 * Decompiled with CFR 0.150.
 */
class yl
extends Thread {
    final /* synthetic */ bxy a;

    yl(bxy bxy2, String string) {
        this.a = bxy2;
        super(string);
    }

    @Override
    public void run() {
        while (this.a.C) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

