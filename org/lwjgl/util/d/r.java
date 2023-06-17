/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.tree.AnnotationNode
 *  org.objectweb.asm.tree.FieldNode
 */
package org.lwjgl.util.d;

import org.lwjgl.util.d.d;
import org.lwjgl.util.d.k;
import org.lwjgl.util.d.q;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;

class r
extends FieldNode {
    final /* synthetic */ q a;

    r(q q2, int n2, String string, String string2, String string3, Object object) {
        this.a = q2;
        super(n2, string, string2, string3, object);
    }

    public void a() {
        if (this.visibleAnnotations == null) {
            this.accept(q.a(this.a));
            return;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        for (AnnotationNode annotationNode : this.visibleAnnotations) {
            if (!k.k.equals(annotationNode.desc)) continue;
            if ("J".equals(this.desc) || "D".equals(this.desc)) {
                n2 = 8;
            } else if ("I".equals(this.desc) || "F".equals(this.desc)) {
                n2 = 4;
            } else if ("S".equals(this.desc) || "C".equals(this.desc)) {
                n2 = 2;
            } else if ("B".equals(this.desc) || "Z".equals(this.desc)) {
                n2 = 1;
            } else {
                throw new ClassFormatError("The @CacheLinePad annotation cannot be used on non-primitive fields: " + this.a.a + "." + this.name);
            }
            this.a.b = true;
            bl3 = true;
            if (annotationNode.values == null) break;
            for (int i2 = 0; i2 < annotationNode.values.size(); i2 += 2) {
                boolean bl4 = annotationNode.values.get(i2 + 1).equals(Boolean.TRUE);
                if ("before".equals(annotationNode.values.get(i2))) {
                    bl2 = bl4;
                    continue;
                }
                bl3 = bl4;
            }
        }
        if (bl2) {
            int n3;
            for (int i3 = n3 = d.a() / n2 - 1; i3 >= 1; --i3) {
                q.b(this.a).visitField(this.access | 1 | 0x1000, this.name + "$PAD_" + i3, this.desc, this.signature, null);
            }
        }
        this.accept(q.c(this.a));
        if (bl3) {
            int n4 = d.a() / n2 - 1;
            for (int i4 = 1; i4 <= n4; ++i4) {
                q.d(this.a).visitField(this.access | 1 | 0x1000, this.name + "$PAD" + i4, this.desc, this.signature, null);
            }
        }
    }
}

