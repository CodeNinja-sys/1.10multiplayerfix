/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.apache.a.e.a;

public final class d {
    public static CharsetDecoder a(a a2) {
        if (a2 == null) {
            return null;
        }
        Charset charset = a2.c();
        CodingErrorAction codingErrorAction = a2.d();
        CodingErrorAction codingErrorAction2 = a2.e();
        if (charset != null) {
            return charset.newDecoder().onMalformedInput(codingErrorAction != null ? codingErrorAction : CodingErrorAction.REPORT).onUnmappableCharacter(codingErrorAction2 != null ? codingErrorAction2 : CodingErrorAction.REPORT);
        }
        return null;
    }

    public static CharsetEncoder b(a a2) {
        if (a2 == null) {
            return null;
        }
        Charset charset = a2.c();
        if (charset != null) {
            CodingErrorAction codingErrorAction = a2.d();
            CodingErrorAction codingErrorAction2 = a2.e();
            return charset.newEncoder().onMalformedInput(codingErrorAction != null ? codingErrorAction : CodingErrorAction.REPORT).onUnmappableCharacter(codingErrorAction2 != null ? codingErrorAction2 : CodingErrorAction.REPORT);
        }
        return null;
    }
}

