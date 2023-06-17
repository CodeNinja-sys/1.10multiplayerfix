/*
 * Decompiled with CFR 0.150.
 */
package javax.a;

import java.util.regex.Pattern;
import javax.a.b.g;
import javax.a.e;

public class f
implements javax.a.b.f {
    public g a(e e2, Object object) {
        Pattern pattern = Pattern.compile(e2.a(), e2.b());
        if (pattern.matcher((String)object).matches()) {
            return g.a;
        }
        return g.d;
    }
}

