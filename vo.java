/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;
import org.lwjgl.util.e.l;

public class vo {
    public final l a;
    public final l b;
    public final Map c;
    public final hu d;
    public final boolean e;

    public vo(l l2, l l3, Map map, hu hu2, boolean bl2) {
        this.a = l2;
        this.b = l3;
        this.c = map;
        this.d = hu2;
        this.e = bl2;
        this.a();
    }

    private void a() {
        for (Map.Entry entry : this.c.entrySet()) {
            float[] arrf = this.a((bqk)entry.getKey());
            ((cvf)entry.getValue()).e.a(arrf);
        }
    }

    private float[] a(bqk bqk2) {
        switch (bqk2) {
            case a: {
                return new float[]{this.a.a, 16.0f - this.b.c, this.b.a, 16.0f - this.a.c};
            }
            case b: {
                return new float[]{this.a.a, this.a.c, this.b.a, this.b.c};
            }
            default: {
                return new float[]{16.0f - this.b.a, 16.0f - this.b.b, 16.0f - this.a.a, 16.0f - this.a.b};
            }
            case d: {
                return new float[]{this.a.a, 16.0f - this.b.b, this.b.a, 16.0f - this.a.b};
            }
            case e: {
                return new float[]{this.a.c, 16.0f - this.b.b, this.b.c, 16.0f - this.a.b};
            }
            case f: 
        }
        return new float[]{16.0f - this.b.c, 16.0f - this.b.b, 16.0f - this.a.c, 16.0f - this.a.b};
    }
}

