/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class ud
extends apt {
    public byt a;
    public List b;
    public List c;
    public List d = ov.a();

    public ud() {
    }

    public ud(Random random, int n2, int n3) {
        super(random, n2, n3);
        this.b = ov.a();
        for (byt byt2 : buh.b()) {
            byt2.c = 0;
            this.b.add(byt2);
        }
        this.c = ov.a();
        for (byt byt2 : buh.c()) {
            byt2.c = 0;
            this.c.add(byt2);
        }
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
    }
}

