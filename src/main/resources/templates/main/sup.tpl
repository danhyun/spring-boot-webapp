package templates.main

layout 'layout.tpl', title: 'Index yo',
        content: contents {
            p "Sup ${twitterProfile.name}"

            ul {
                friends.each { friend ->
                    li friend.name
                }
            }
        }