/*
 * Decompiled with CFR 0.150.
 */
package javax.a;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.a.b.f;
import javax.a.b.g;
import javax.a.p;

public class q
implements f {
    public g a(p p2, Object object) {
        if (!(object instanceof String)) {
            return g.d;
        }
        try {
            Pattern.compile((String)object);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return g.d;
        }
        return g.a;
    }
}

