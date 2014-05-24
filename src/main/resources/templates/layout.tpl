yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
    head {
        meta('http-equiv':'"Content-Type" content="text/html; charset=utf-8"')
        title(title)
        link(rel:'stylesheet', href:'/css/reset.css')
        link(rel:'stylesheet', href:'/css/style.css')
    }
    body {
        h1(title)
        div { content() }
    }
}