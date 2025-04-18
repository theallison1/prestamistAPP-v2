package com.paparazziapps.pretamistapp.data

object PADataConstants {

    //currency
    const val CURRENCY = "S/." // S/. is the symbol for the Peruvian Sol currency

    //Resend email
    const val RESEND_EMAIL_FROM = "PrestamistApp <hola@prestamosapps.com>"

    //child branches
    const val BRANCHES = "sucusales"

    //collections
    const val DETAIL_LOAN_COLLECTION = "DetallePrestamo"
    const val USERS_COLLECTION = "Users"
    const val LOAN_COLLECTION = "Prestamos"
    const val CLIENTS_COLLECTION = "Clientes"

    //analytics events
    const val EVENT_SHARE_RECEIPT_OTHER_APPS = "share_receipt_other_apps"
    const val EVENT_SHARE_RECEIPT_WHATSAPP = "share_receipt_whatsapp"
    const val EVENT_SEE_RECEIPT = "see_receipt"

    //resend email events
    const val EVENT_RESEND_EMAIL_SUCCESS = "resend_email_success"
    const val EVENT_RESEND_EMAIL_ERROR = "resend_email_error"

    //client
    const val CLIENT_DOCUMENT = "document"
}