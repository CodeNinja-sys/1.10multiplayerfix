/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

class cbv
implements cbd {
    private final ef b;
    private final bpx c;
    private final List d;
    final /* synthetic */ bln a;

    public cbv(bln bln2, ef ef2) {
        this.a = bln2;
        this.b = ef2;
        this.d = ov.a();
        for (String string : ef2.c()) {
            bae bae2 = bxy.B().x().a(string);
            if (bae2 == null) continue;
            this.d.add(bae2);
        }
        if (this.d.isEmpty()) {
            this.c = ccj.a();
        } else {
            String string = ((bae)this.d.get(new Random().nextInt(this.d.size()))).a().b();
            this.c = ciy.d(string);
            ciy.a(this.c, string);
        }
    }

    @Override
    public void a(bou bou2) {
        bou2.a(new czw(this.d));
    }

    @Override
    public cbg a() {
        return new aym(this.b.b());
    }

    @Override
    public void a(float f2, int n2) {
        int n3 = -1;
        String string = deb.b(this.b.d());
        if (string.length() >= 2) {
            n3 = bxy.B().k.b(string.charAt(1));
        }
        if (n3 >= 0) {
            float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
            float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f5 = (float)(n3 & 0xFF) / 255.0f;
            alo.a(1, 1, 15, 15, cmk.b(f3 * f2, f4 * f2, f5 * f2) | n2 << 24);
        }
        bxy.B().P().a(this.c);
        cja.c(f2, f2, f2, (float)n2 / 255.0f);
        alo.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        alo.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public boolean b() {
        return !this.d.isEmpty();
    }
}

