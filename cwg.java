/*
 * Decompiled with CFR 0.150.
 */
import java.nio.ByteBuffer;

public class cwg {
    private int a;
    private final ava b;
    private int c;

    public cwg(ava ava2) {
        this.b = ava2;
        this.a = cjg.e();
    }

    public void a() {
        cjg.g(cjg.R, this.a);
    }

    public void a(ByteBuffer byteBuffer) {
        this.a();
        cjg.a(cjg.R, byteBuffer, 35044);
        this.b();
        this.c = byteBuffer.limit() / this.b.g();
    }

    public void a(int n2) {
        cja.d(n2, 0, this.c);
    }

    public void b() {
        cjg.g(cjg.R, 0);
    }

    public void c() {
        if (this.a >= 0) {
            cjg.g(this.a);
            this.a = -1;
        }
    }
}

