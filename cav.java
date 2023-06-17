/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.hi;
import com.a.b.ac;
import com.a.b.t;
import com.a.b.w;
import java.util.Collection;
import java.util.Set;

public class cav
extends hi
implements awk {
    private final Set a = aad.a();

    @Override
    public void a(w w2) {
        if (w2.p()) {
            for (w w3 : w2.u()) {
                this.add(w3.d());
            }
        }
    }

    @Override
    public w a() {
        t t2 = new t();
        for (String string : this) {
            t2.a(new ac(string));
        }
        return t2;
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }
}

