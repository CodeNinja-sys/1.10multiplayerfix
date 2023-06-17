/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.eq;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.CharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class ep {
    private Appendable a;
    private int b;
    private List c;

    public ep(StringBuilder stringBuilder) {
        this.a = stringBuilder;
        this.b = stringBuilder.length();
        this.c = null;
    }

    public ep(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
        this.c = null;
    }

    public void a() {
        this.c = new ArrayList();
    }

    public void a(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(CharSequence charSequence, int n2, int n3) {
        try {
            this.a.append(charSequence, n2, n3);
            this.b += n3 - n2;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(CharacterIterator characterIterator) {
        this.b += ep.a(this.a, characterIterator);
    }

    public static int a(Appendable appendable, CharacterIterator characterIterator) {
        try {
            int n2 = characterIterator.getBeginIndex();
            int n3 = characterIterator.getEndIndex();
            int n4 = n3 - n2;
            if (n2 < n3) {
                appendable.append(characterIterator.first());
                while (++n2 < n3) {
                    appendable.append(characterIterator.next());
                }
            }
            return n4;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(Format format, Object object) {
        if (this.c == null) {
            this.a(format.format(object));
        } else {
            AttributedCharacterIterator attributedCharacterIterator = format.formatToCharacterIterator(object);
            int n2 = this.b;
            this.a(attributedCharacterIterator);
            attributedCharacterIterator.first();
            int n3 = attributedCharacterIterator.getIndex();
            int n4 = attributedCharacterIterator.getEndIndex();
            int n5 = n2 - n3;
            while (n3 < n4) {
                Map<AttributedCharacterIterator.Attribute, Object> map = attributedCharacterIterator.getAttributes();
                int n6 = attributedCharacterIterator.getRunLimit();
                if (map.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : map.entrySet()) {
                        this.c.add(new eq(entry.getKey(), entry.getValue(), n5 + n3, n5 + n6));
                    }
                }
                n3 = n6;
                attributedCharacterIterator.setIndex(n3);
            }
        }
    }

    static /* synthetic */ List a(ep ep2) {
        return ep2.c;
    }

    static /* synthetic */ int b(ep ep2) {
        return ep2.b;
    }
}

