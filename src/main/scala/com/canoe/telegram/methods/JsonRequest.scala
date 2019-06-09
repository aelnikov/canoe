package com.canoe.telegram.methods

/** Base type for JSON-encoded API requests
  *
  * @tparam R Expected result type.
  *
  * The request will be sent as application/json
  */
trait JsonRequest[R] extends Request[R]
