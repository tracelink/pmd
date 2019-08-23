/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import net.sourceforge.pmd.lang.scala.ast.ScalaParserVisitor;

import scala.meta.Type;

/**
 * The ASTTypeParam node implementation.
 */
public class ASTTypeParam extends AbstractScalaNode<Type.Param> {

    /**
     * Create the AST node for this Scala node.
     * 
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTTypeParam(Type.Param scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}