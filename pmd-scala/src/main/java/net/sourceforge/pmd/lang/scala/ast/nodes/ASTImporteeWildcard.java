/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import net.sourceforge.pmd.lang.scala.ast.ScalaParserVisitor;

import scala.meta.Importee;

/**
 * The ASTImporteeWildcard node implementation.
 */
public class ASTImporteeWildcard extends AbstractScalaNode<Importee.Wildcard> {

    /**
     * Create the AST node for this Scala node.
     * 
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTImporteeWildcard(Importee.Wildcard scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}