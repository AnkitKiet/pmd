/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTCData.java */

package net.sourceforge.pmd.lang.vf.ast;

public class ASTCData extends AbstractVFNode {
    public ASTCData(int id) {
        super(id);
    }

    public ASTCData(VfParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(VfParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}