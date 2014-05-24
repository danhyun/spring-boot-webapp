html {
    head {
        title(title)
        link(rel:'stylesheet', href:'/css/reset.css')
        link(rel:'stylesheet', href:'/css/style.css')
    }
    body {
        div(class:'container') {
            h1(title)
            div { content() }
        }
    }
}