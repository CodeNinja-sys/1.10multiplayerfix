/*
 * Decompiled with CFR 0.150.
 */
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import javax.crypto.SecretKey;

class apy
implements ad {
    final /* synthetic */ SecretKey a;
    final /* synthetic */ afm b;

    apy(afm afm2, SecretKey secretKey) {
        this.b = afm2;
        this.a = secretKey;
    }

    @Override
    public void a(ab ab2) {
        afm.a(this.b).a(this.a);
    }
}

