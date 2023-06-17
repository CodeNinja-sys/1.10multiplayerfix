/*
 * Decompiled with CFR 0.150.
 */
import java.security.PublicKey;

public class cnh
implements ds {
    private String a;
    private PublicKey b;
    private byte[] c;

    public cnh() {
    }

    public cnh(String string, PublicKey publicKey, byte[] arrby) {
        this.a = string;
        this.b = publicKey;
        this.c = arrby;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(20);
        this.b = sv.a(si2.a());
        this.c = si2.a();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b.getEncoded());
        si2.a(this.c);
    }

    public void a(su su2) {
        su2.a(this);
    }

    public String a() {
        return this.a;
    }

    public PublicKey b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }
}

