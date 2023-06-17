/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class to {
    private final boolean a;

    public to() {
        this(false);
    }

    public to(boolean bl2) {
        this.a = bl2;
    }

    public abstract boolean a(iu var1, Random var2, cmz var3);

    public void e() {
    }

    protected void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.a) {
            iu2.a(cmz2, dbk2, 3);
        } else {
            iu2.a(cmz2, dbk2, 2);
        }
    }
}

