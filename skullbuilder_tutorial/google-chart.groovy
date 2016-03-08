// following the first half of this link https://www.youtube.com/watch?v=-mRlc_vjiqE

// base URL
def base = 'http://chart.apis.google.com/chart?'

// I'm confused on the syntax as this is reffered to as a "map"
// I'm getting the impression that 
def params = [cht: 'p3' , chs: '250x100',
                chd: 't:60,40' , ch1: 'Hello|World']

// collect accepts a block/closure. Collect seems to me like map or .each
// the $ sign is a shorthanded string interpolation "g-strings"               
url = base + params.collect { k,v -> "$k=$v" }.join('&')

//toURL() converts it to a URL
//text is a method that invokes a get text 
url.toURL().text

//Builder
import javax.swing.ImageIcon
import javax.swing.WindowConstants as WC // as WC acts as a callable shorthand
import java.awt.BorderLayout as BL
import groovy.swing.SwingBuilder

SwingBuilder.build() {
    frame(title:'Hello, World!', visible:true,
        defaultCloseOperation:WC.EXIT_ON_CLOSE) {
        label(icon:new ImageIcon(new URL(url)),
            constraints:BL.CENTER)
        }.pack()
}

println "hello world!"





