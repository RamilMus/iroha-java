//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit

/**
 * FindRolesByAccountId
 *
 * Generated from 'FindRolesByAccountId' regular structure
 */
public data class FindRolesByAccountId(
    public val id: EvaluatesTo<AccountId>,
) {
    public companion object : ScaleReader<FindRolesByAccountId>, ScaleWriter<FindRolesByAccountId> {
        override fun read(reader: ScaleCodecReader): FindRolesByAccountId = try {
            FindRolesByAccountId(
                EvaluatesTo.read(reader) as EvaluatesTo<AccountId>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: FindRolesByAccountId): Unit = try {
            EvaluatesTo.write(writer, instance.id)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
