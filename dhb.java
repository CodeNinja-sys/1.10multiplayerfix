/*
 * Decompiled with CFR 0.150.
 */
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class dhb
implements ds {
    private byte[] a = new byte[0];
    private byte[] b = new byte[0];

    public dhb() {
    }

    public dhb(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.a = sv.a(publicKey, secretKey.getEncoded());
        this.b = sv.a(publicKey, arrby);
    }

    @Override
    public void a(si si2) {
        this.a = si2.a();
        this.b = si2.a();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
    }

    public void a(adn adn2) {
        adn2.a(this);
    }

    public SecretKey a(PrivateKey privateKey) {
        return sv.a(privateKey, this.a);
    }

    public byte[] b(PrivateKey privateKey) {
        if (privateKey == null) {
            return this.b;
        }
        return sv.b(privateKey, this.b);
    }
}

