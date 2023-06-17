/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;

public class bkq {
    private final Map a = sz.c();
    private int b;

    public boolean a(azg azg2) {
        return this.a(azg2, 0.0f) > 0.0f;
    }

    public float a(azg azg2, float f2) {
        cia cia2 = (cia)this.a.get(azg2);
        if (cia2 != null) {
            float f3 = cia2.b - cia2.a;
            float f4 = (float)cia2.b - ((float)this.b + f2);
            return cmk.a(f4 / f3, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public void a() {
        ++this.b;
        if (!this.a.isEmpty()) {
            Iterator iterator = this.a.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                if (((cia)entry.getValue()).b > this.b) continue;
                iterator.remove();
                this.c((azg)entry.getKey());
            }
        }
    }

    public void a(azg azg2, int n2) {
        this.a.put(azg2, new cia(this, this.b, this.b + n2, null));
        this.b(azg2, n2);
    }

    public void b(azg azg2) {
        this.a.remove(azg2);
        this.c(azg2);
    }

    protected void b(azg azg2, int n2) {
    }

    protected void c(azg azg2) {
    }
}

