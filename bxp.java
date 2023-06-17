/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.n.a.dl;

class bxp
implements Runnable {
    final /* synthetic */ dl a;
    final /* synthetic */ age b;

    bxp(age age2, dl dl2) {
        this.b = age2;
        this.a = dl2;
    }

    @Override
    public void run() {
        this.a.cancel(false);
    }
}

