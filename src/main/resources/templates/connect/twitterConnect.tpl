layout 'layout.tpl', title: 'Connect with twitter',
    content: contents {
        form(action: '/connect/twitter', method: 'POST') {
            button ('Connect To Twitter', type: 'submit')
        }
    }