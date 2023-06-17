/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.m.aa;
import com.a.a.m.ab;
import com.a.a.m.ay;
import com.a.a.m.bl;
import com.a.a.m.w;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;

class z {
    private final jt a;

    z() {
        this.a = jt.m();
    }

    private z(jt jt2) {
        this.a = jt2;
    }

    final z a(Map map) {
        ju ju2 = jt.n();
        ju2.b(this.a);
        for (Map.Entry entry : map.entrySet()) {
            Type type;
            ab ab2 = (ab)entry.getKey();
            cl.a(!ab2.b(type = (Type)entry.getValue()), "Type variable %s bound to itself", new Object[]{ab2});
            ju2.b(ab2, type);
        }
        return new z(ju2.b());
    }

    final Type a(TypeVariable typeVariable) {
        z z2 = this;
        aa aa2 = new aa(this, typeVariable, z2);
        return this.a(typeVariable, aa2);
    }

    Type a(TypeVariable typeVariable, z z2) {
        Type type = (Type)this.a.get(new ab(typeVariable));
        if (type == null) {
            Object[] arrobject = typeVariable.getBounds();
            if (arrobject.length == 0) {
                return typeVariable;
            }
            Object[] arrobject2 = w.a(new w(z2, null), (Type[])arrobject);
            if (bl.a && Arrays.equals(arrobject, arrobject2)) {
                return typeVariable;
            }
            return ay.a(typeVariable.getGenericDeclaration(), typeVariable.getName(), (Type[])arrobject2);
        }
        return new w(z2, null).b(type);
    }
}

