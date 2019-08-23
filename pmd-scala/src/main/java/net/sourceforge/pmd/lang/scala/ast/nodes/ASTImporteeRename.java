/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import net.sourceforge.pmd.lang.scala.ast.ScalaParserVisitor;

import scala.meta.Importee;

/**
 * The ASTImporteeRename node implementation.
 */
public class ASTImporteeRename extends AbstractScalaNode<Importee.Rename> {

    /**
     * Create the AST node for this Scala node.
     * 
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTImporteeRename(Importee.Rename scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}