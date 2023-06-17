/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import org.apache.commons.c.am;

public class bcw {
    private String a;
    private final List b = ov.a();

    private bcw() {
    }

    private void a(String string) {
        this.b.add(0, string);
    }

    public String a() {
        return am.a((Iterable)this.b, "->");
    }

    public String toString() {
        if (this.a != null) {
            if (this.b.isEmpty()) {
                return this.a;
            }
            return this.a + " " + this.a();
        }
        if (this.b.isEmpty()) {
            return "(Unknown file)";
        }
        return "(Unknown file) " + this.a();
    }

    /* synthetic */ bcw(cht cht2) {
        this();
    }

    static /* synthetic */ void a(bcw bcw2, String string) {
        bcw2.a(string);
    }

    static /* synthetic */ String b(bcw bcw2, String string) {
        bcw2.a = string;
        return bcw2.a;
    }
}

